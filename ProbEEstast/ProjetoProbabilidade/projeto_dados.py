import pandas as pd
import matplotlib.pyplot as plt

#Dados que serão avaliados
dados_df = pd.read_csv("filmes.csv")

#INFO GERAL SOBRE OS DADOS:
# LOCAL ONDE ADQUIRIMOS: KAGGLE - LINK: https://www.kaggle.com/datasets/octopusteam/imdb-top-1000-movies?resource=download
#Variáveis Contínuas: averageRating, numVotes, releaseYear
#Variáveis Categóricas: id, title, genres
#Contexto: Filmes e cinema (entretenimento)

#A) Estatísticas Descritivas:
#1. Média
media_dados_df = dados_df['averageRating'].mean()
print("\nMédia:", media_dados_df)

#2. Mediana
mediana_dados_df = dados_df['averageRating'].median()
print("\nMediana:", mediana_dados_df)

#3. Moda
moda_dados_df = dados_df['averageRating'].mode().tolist()  
print("\nModa:", moda_dados_df)

#Desvio Padrão
desvio_padrao_dados_df = dados_df[['averageRating']].std()
print("\nDesvio Padrão:", desvio_padrao_dados_df.to_string(index=False))

#Variância
variancia_dados_df = dados_df[['averageRating']].var()
print("\nVariância:", variancia_dados_df.to_string(index=False)) 

#B) Distribuição dos Dados:
#1. Histograma 
plt.hist(dados_df['averageRating'], color='red', alpha=0.7)
plt.title('Histograma da Média de Notas')
plt.xlabel('Média de Notas')
plt.ylabel('Frequência')
plt.grid(axis='y', alpha=0.75)
plt.show()

#2. Boxplot 
plt.boxplot(dados_df['averageRating'], vert=True)
plt.title('Boxplot da Média de Notas')
plt.xlabel('Média de Notas')
plt.grid(axis='x', alpha=0.75)
plt.show()

#C) Correlação entre Variáveis
# Ccorrelação de Pearson
correlacao_person = dados_df['averageRating'].corr(dados_df['numVotes'])
print("\nCorrelação entre Média de Notas e Número de Votos:", correlacao_person)

# Dispersão
plt.scatter(dados_df['numVotes'], dados_df['averageRating'], alpha=0.7, color='blue')
plt.title('Gráfico de Dispersão: Média de Notas vs. Número de Votos')
plt.xlabel('Número de Votos')
plt.ylabel('Média de Notas')
plt.grid(alpha=0.75)
plt.show() 

# Regressão Linear
#Continuar