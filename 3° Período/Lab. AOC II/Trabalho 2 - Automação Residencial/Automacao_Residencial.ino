#include <IRremote.h>

int valorPIR=0;
int PIR = 2;
int valorFotoResistor=0;
int fotoResistor = A1;
float sensorTemp = A0;
int change =0;

//Variaveis Infravermelho
int sensorInfravermelho = 3;
IRrecv irrecv(sensorInfravermelho);
decode_results results;


// Saídas
int ledPIR = 13;
int ledFotoResistor = 12;
int ledSensorInfravermelho = 11;
int ledSensorTemp = 8;

void setup()
{
  Serial.begin(9600);
  pinMode(13, OUTPUT);
  pinMode(2, INPUT);
  pinMode(A1, INPUT);
  pinMode(12, OUTPUT);
  pinMode(3, INPUT);
  pinMode(11, OUTPUT);
  pinMode(A0, INPUT);
  pinMode(8, OUTPUT);
  irrecv.enableIRIn();
}

void loop()
{
  
  //Sensor PIR
  valorPIR = digitalRead(PIR);
  if (valorPIR == 1){
    digitalWrite(ledPIR, HIGH);
  } 
   else {
    digitalWrite(ledPIR, LOW);
   }   
  
  
  //Sensor infravermelho
  if (irrecv.decode(&results)){
     irrecv.resume();
    }
  if (results.value == 0xFD00FF && change==0){
    digitalWrite(ledSensorInfravermelho, HIGH);
    results.value = 0;
    change = 1;
  }
   
  if (results.value == 0xFD00FF && change ==1){
    digitalWrite(ledSensorInfravermelho, LOW);
    results.value = 0;
    change = 0;
  }
  

   //Sensor de Temperatura
  float valor = analogRead(sensorTemp);
  float tensao = (valor/1024)*5;
  float temperatura =(tensao-0.5)*100;
  
  if(temperatura>=29){
    digitalWrite(ledSensorTemp, HIGH);
    }
  else{
    digitalWrite(ledSensorTemp, LOW);
    }
 
      
   //Sensor LDR
   valorFotoResistor = analogRead(fotoResistor);
   Serial.println(valorFotoResistor);
   if(valorFotoResistor >= 800){
    digitalWrite(ledFotoResistor, HIGH);
    }
   else{
    digitalWrite(ledFotoResistor, LOW);
    }   
}
