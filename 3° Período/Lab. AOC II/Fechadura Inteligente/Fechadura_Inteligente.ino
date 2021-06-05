#include <Keypad.h>
#include <LiquidCrystal.h>
#include <Servo.h>


Servo servo;

LiquidCrystal lcd(A0, A1, A2, A3, A4, A5);

#define Tamanho_Senha 4 

int pos = 0;    

char Dados[Tamanho_Senha]; 
char Mestre[4] = "123";
byte contagem_dados = 0;
char customTecla;

const byte LINHAS = 4;
const byte COLUNAS = 4;
char matriz[LINHAS][COLUNAS] = {
  {'1', '2', '3', 'A'},
  {'4', '5', '6', 'B'},
  {'7', '8', '9', 'C'},
  {'*', '0', '#', 'D'}
};
bool porta = true;

byte Pinoslinha[LINHAS] = {1, 2, 3, 4}; 
byte Pinoscoluna[COLUNAS] = {5, 6, 7, 8}; 

Keypad customTeclado( makeKeymap(matriz), Pinoslinha, Pinoscoluna, LINHAS, COLUNAS); 

     void setup()
 {
  servo.attach(9);
  ServoClose();
  lcd.begin(16, 2);
  lcd.print(" Projeto Arduino");
  lcd.setCursor(0, 1);
  lcd.print("Trava Automatica");
  delay(3000);
  lcd.clear();
 }
     void loop()
 {
   if (porta == 0)
 {
    customTecla = customTeclado.getKey();

    if (customTecla == '#')
 {
      lcd.clear();
      ServoClose();
      lcd.print("  Porta Fechada");
      delay(3000);
      porta = 1;
 }
 }
   else Open();
 }
     void clearDados()
 {
   while (contagem_dados != 0)
 { 
    Dados[contagem_dados--] = 0; 
 }
   return;
 }
    void ServoOpen()
 {
  for (pos = 180; pos >= 0; pos -= 5) { 
   
    servo.write(pos);              
    delay(15);                       
  }
  }
     void ServoClose()
 {
  for (pos = 0; pos <= 180; pos += 5) { 
    servo.write(pos);              
    delay(15);                       
 }
 }
     void Open()
 {
  lcd.setCursor(0, 0);
  lcd.print(" Digite a Senha");
  
  customTecla = customTeclado.getKey();
  if (customTecla) 
 {
    Dados[contagem_dados] = customTecla; 
    lcd.setCursor(contagem_dados, 1); 
    lcd.print(Dados[contagem_dados]); 
    contagem_dados++;
 }

  if (contagem_dados == Tamanho_Senha - 1)
 {
    if (!strcmp(Dados, Mestre)) 
 {
      lcd.clear();
      ServoOpen();
      lcd.print("  Porta Aberta");
      porta = 0;
 }
    else
 {
      lcd.clear();
      lcd.print("  Senha Errada");
      delay(1000);
      porta = 1;
 }
    clearDados();
 }
 }
