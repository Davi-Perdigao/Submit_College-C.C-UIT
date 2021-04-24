int pin_pot = A0;
int pin_led = 6;
int pin_buzzer = 5;
int pin_btn = 2;

void setup(){ 
  //DECLARANDO POTENCIOMETRO E BOTÃO COMO ENTRADA, LED E BUZZER COMO SAÍDA
  pinMode(pin_pot, INPUT);
  pinMode(pin_led, OUTPUT);
  pinMode(pin_btn, INPUT);
  pinMode(pin_buzzer, OUTPUT);
  Serial.begin(9600);
}

void loop(){
  
  int val_pot = analogRead(pin_pot); // Lê valores no potenciômetro
  int frequencia = map(val_pot, 0, 1023, 0, 2500); //define valores de frequência
  float volt = val_pot * (5.00/1023.0); //Valores da tensão no circuito
  
  //ESCRITA PARA MONITOR SERIAL
  Serial.print("RESISTENCIA = ");
  Serial.print(val_pot);
  Serial.print(" | VOLTAGEM = ");
  Serial.print(volt);
  Serial.print(" | FREQUENCIA = ");
  Serial.println(frequencia);
  
  if (digitalRead(pin_btn) == HIGH) {// LER BOTÃO
    digitalWrite(pin_led, HIGH);
    tone(pin_buzzer,20, 100);
    delay(700);
    digitalWrite(pin_led, LOW);
    noTone(pin_buzzer);
    delay(700);
  }
  

 tone(pin_buzzer, frequencia, 100);
 analogWrite(pin_led, frequencia);
  delay(10);
}
