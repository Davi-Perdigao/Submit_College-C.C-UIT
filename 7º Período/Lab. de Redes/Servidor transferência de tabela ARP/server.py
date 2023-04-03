import socket
import subprocess

# Definindo o endereço e a porta em que o servidor irá escutar
HOST = '127.0.0.1'  
PORT = 2000 


# Criando um socket TCP e o associa ao endereço e porta especificados
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((HOST, PORT)) 
    s.listen()  
    # Aguardando uma conexão do cliente
    conn, addr = s.accept()  
    # Quando a conexão é estabelecida, exibe o endereço do cliente
    with conn:
        print('conexao', addr)
        # Obtém a tabela ARP usando o comando "arp -a" do sistema operacional
        arp_data = subprocess.check_output(['arp', '-a']).decode('latin-1')
        # Envia os dados da tabela ARP para o cliente
        conn.sendall(arp_data.encode('utf-8')) 
