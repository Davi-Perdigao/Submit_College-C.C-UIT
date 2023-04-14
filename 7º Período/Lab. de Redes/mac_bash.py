import os
import re

print("Endereços IP e físicos associados:")

# Executando o comando "arp -a" e capturando a saída
output = os.popen("arp -a").read()

# Filtrando a saída para extrair os IPs e endereços físicos associados
ip_mac_list = re.findall(
    r'(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}).*([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})', output)

# Exibe os resultados encontrados
for ip, _, mac in ip_mac_list:
    # Executando "arp -a" com o endereço IP para obter o endereço físico
    output = os.popen(f"arp -a {ip}").read()
    physical_address = re.search(
        r'([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})', output).group(0)
    print(f"{ip} -> {physical_address.upper()}")