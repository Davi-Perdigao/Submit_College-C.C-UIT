#include <LiquidCrystal.h>
#include <IRremote.h> 
#include <Servo.h> 

LiquidCrystal LCD(13,12,11,10,9,8); //Declarando Pinos LCD


int SensorTempPino=0; //Pino Sensor de Temperatura


int TempBaixa=18; //Declarando  valores Temperaturas Baixas e Altas

int TempAlta=30;

const int pinSensor = 2; //Pino Sensor PIR + Rele
const int pinRele = 5;


volatile unsigned char estadoSensor = 0; //Estado Inicial do Sensor


void trocaEstadoSensor() { //Momento que ocorrerá a ativação do Sensor
  estadoSensor = digitalRead(pinSensor); 
}

int RECV_PIN = 4;
IRrecv irrecv(RECV_PIN);
decode_results results;

Servo myservo; //ServoMotor

void setup() { //Rele como saída e Sensor como entrada
  pinMode(pinRele, OUTPUT);   
  pinMode(pinSensor, INPUT);
  irrecv.enableIRIn();
  myservo.write(0);
  
  attachInterrupt(digitalPinToInterrupt(pinSensor), trocaEstadoSensor, CHANGE);
 
  LCD.begin(16,2); //Confirguração Visor LCD
  
  LCD.print("Temperatura:");
  
  LCD.setCursor(0,1);
  
  LCD.print("      C         ");
  
}

void loop() { //Loop do Sensor PIR para acender a lâmpada
  if (estadoSensor == HIGH) { 
    digitalWrite(pinRele, HIGH); 
  } else {
    digitalWrite(pinRele, LOW); 
  }
  delay(500); 
  
    //Configuração Sensor de Temperatura
  int SensorTempTensao=analogRead(SensorTempPino);

    
  float Tensao=SensorTempTensao*5;
  Tensao/=1024;

    
  float TemperaturaC=(Tensao-0.5)*100;
  
    LCD.setCursor(0,1);

    
  LCD.print(TemperaturaC);
  
  LCD.setCursor(9,1);

    if (TemperaturaC>=TempAlta) { //Ar Condicionado
      LCD.print("Ar ON ");
    }
    else if (TemperaturaC<=TempBaixa){
      LCD.print("Ar OFF");
      
    }
    

    
    delay(1000);
  
   myservo.attach(3);
   
    if (irrecv.decode(&results)) 
  {
       
    switch (results.value)
    {
      
      case 0xFD609F: //botão da direita acionando Servomotor
    myservo.write(-180); 
 
        break;
      
      case 0xFD20DF: //botão da esquerda acionando ServoMotor
        myservo.write(180);

        break; 
      
    }    
    irrecv.resume();
  }
  
}
