package main

import (
	"encoding/json"
	"errors"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"net/url"

	tgbotapi "github.com/go-telegram-bot-api/telegram-bot-api"
)

const (
	dictionaryAPIPrefix = "https://api.dictionaryapi.dev/api/v2/entries/pt-BR/"
)

type WordInfo []struct {
	Word      string     `json:"word"`
	Phonetics []struct{} `json:"phonetics"`
	Meanings  []struct {
		PartOfSpeech string `json:"
		"`
		Definitions []struct {
			Definition string        `json:"definition"`
			Example    string        `json:"example"`
			Synonyms   []string      `json:"synonyms"`
			Antonyms   []interface{} `json:"antonyms"`
		} `json:"definitions"`
	} `json:"meanings"`
}

func main() {

	bot, err := tgbotapi.NewBotAPI("1846384519:AAHPmdlTpuhkWcDDtNTFU1lFSOBqsC6g5xo")

	if err != nil {
		log.Fatal("Conexão a API do Telegram - Ativado")
		return
	}

	log.Printf("Autorizado para a conta %s", bot.Self.UserName)

	config := tgbotapi.UpdateConfig{}
	updates, err := bot.GetUpdatesChan(config)

	for update := range updates {
		//fmt.Println("word:", update.Message.Text)
		receiveWord, err := getWordInfo(update.Message.Text)
		if err != nil {
			fmt.Println(err)
			return
		}

		fmt.Println("Palavra recebida:", receiveWord)

		wordParams := formatMessage(receiveWord)
		//fmt.Println("Parametro da Palavra:", wordParams)
		msg := tgbotapi.NewMessage(update.Message.Chat.ID, wordParams)
		_, err = bot.Send(msg)
		if err != nil {
			log.Println("Envio de Messagem - Ativado", err)
			return
		}
	}

}

//Funções implementadas

func requestWord(url string) (*http.Response, error) {
	request, err := http.NewRequest("GET", url, nil)
	if err != nil {
		return nil, err
	}

	request.Header.Set("Accept", "application/json")

	response, err := http.DefaultClient.Do(request)
	if err != nil {
		return response, err
	}

	return response, nil
}

func getWordInfo(word string) (*WordInfo, error) {
	var wordInfo WordInfo

	response, err := requestWord(dictionaryAPIPrefix + url.QueryEscape(word))
	if err != nil {
		return nil, errors.New("Requisição - Ativado:" + err.Error())
	}

	if response.StatusCode == 200 {
		defer response.Body.Close()

		data, err := ioutil.ReadAll(response.Body)
		if err != nil {
			return nil, errors.New("Leitura de respostas - Ativado" + err.Error())
		}

		err = json.Unmarshal(data, &wordInfo)
		if err != nil {
			return nil, errors.New("UnMarshall JSON - Ativado" + err.Error())
		}

		return &wordInfo, nil
	}

	return nil, errors.New("Resposta inesperada")

}

func formatMessage(receiveWord *WordInfo) string {
	var wordParams string

	for _, value := range *receiveWord {
		for _, meaning := range value.Meanings {
			wordParams += "Parte da fala:" + meaning.PartOfSpeech + "\n"

			for _, def := range meaning.Definitions {
				wordParams += "Definição:" + def.Definition + "\n"
				wordParams += "Exemplo:" + def.Example + "\n"
			}
		}
		/**
		for _, aud := range value.Phonetics {
			wordParams += "Audio:" + aud + "\n"
		}
		*/

	}

	return wordParams

}