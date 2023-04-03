import socket

# Definindo o endereço e a porta do servidor
HOST = '127.0.0.1'  
PORT = 2000  

# Criando um objeto de soquete TCP e se conecta ao servidor
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))  
    # Recebe os dados da tabela ARP enviados pelo servidor
    arp_data = s.recv(4096).decode('utf-8')
    # Exibe os dados da tabela ARP na tela
    print(arp_data) 
    
