import uuid
import requests

# Utilizando o módulo uuid() para localizar o MAC da máquina
mac = uuid.getnode()

# Convertendo o endereço MAC em uma string no formato XX-XX-XX-XX-XX-XX. Esse formato é necessário para fazer a consulta na API, que espera o endereço MAC como uma string separada por dois-pontos
mac_str = ':'.join(('%012X' % mac)[i:i+2] for i in range(0,12,2))

# Utilizando a biblioteca requests para fazer uma solicitação GET para a API https://api.macvendors.com/ com o endereço MAC obtido anteriormente como parte da URL
url = f'https://api.macvendors.com/{mac_str}'
response = requests.get(url)

# Em caso de sucesso na resposta do JSON, o fabricante é exibido na tela. Caso contrário, um mensagem de erro é exibida
if response.status_code == 200:
    print(f'Fabricante: ', response.text)
else:
    print(f'Não foi possível obter o fabricante para o MAC', mac_str)