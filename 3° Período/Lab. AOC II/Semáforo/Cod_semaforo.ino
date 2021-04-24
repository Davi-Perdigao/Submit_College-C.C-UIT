void setup()
{
  pinMode(13, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
}

void loop()
{
  digitalWrite(13, HIGH);
  delay(4000); // Wait for 4000 millisecond(s)
  digitalWrite(13, LOW);
  digitalWrite(11, HIGH);
  delay(5000); // Wait for 5000 millisecond(s)
  digitalWrite(11, LOW);
  digitalWrite(12, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(12, LOW);
}
