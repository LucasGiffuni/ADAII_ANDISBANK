# Usar a imagem oficial do MySQL do Docker Hub
FROM mysql:8.0

# Expor a porta 3306 para que o MySQL esteja acessível externamente
EXPOSE 3306

# Comando padrão para iniciar o MySQL
CMD ["mysqld"]
