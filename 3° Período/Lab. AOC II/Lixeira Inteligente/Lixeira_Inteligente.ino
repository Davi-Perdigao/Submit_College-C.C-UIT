#include <Servo.h>  
//Lixeira Inteligente, utilizando o sensor ultrassônico e um servo motor para levantar e fechar a tampa
int distancia = 0;

long leituraSensor(int triggerPin, int echoPin)
{
  pinMode(triggerPin, OUTPUT);  // Definir Trigger como saída e Zerar 
  digitalWrite(triggerPin, LOW);
  delayMicroseconds(2);
  digitalWrite(triggerPin, HIGH);
  delayMicroseconds(10); // Definir trigger como HIGH por 10 microssegundos
  digitalWrite(triggerPin, LOW);
  pinMode(echoPin, INPUT);
  return pulseIn(echoPin, HIGH); //Lê o pino eco e retorna o tempo de viagem da onda sonora em microssegundos
}

Servo servo_9;

void setup()
{
  servo_9.attach(9, 500, 2500); 

}

void loop()
{
  distancia = 0.01723 * leituraSensor(7, 6);
  if (distancia < 50) { //Se distância for menor que 50cm
    servo_9.write(90);
    delay(5000); // Espera 5000 milissegundos
    servo_9.write(0);
  }
}
