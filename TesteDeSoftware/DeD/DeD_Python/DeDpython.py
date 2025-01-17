#INTERFACES NECESSÁRIAS

#DistribuirPontosStrategy


#CLASSES NECESSÁRIAS

#Personagem
#Atributos
#DistribuirEscolha27 -> implements DistribuirPontosStrategy
#ModificadorAtributo -> implements DistribuirPontosStrategy
#Humano -> implements DistribuirPontosStrategy

from abc import ABC, abstractmethod


class DistribuirPontosStrategy(ABC):
    @abstractmethod

    # Getter para obter o valor de um atributo específico
    def set_atributo():
        pass

    # Setter para modificar o valor de um atributo específico
    def get_atributo():
        pass


class Atributos:
    def __init__(self):
        self.conjunto_atributos = {
            "Forca" : 8,
            "Destreza" : 8,
            "Constituicao" : 8,
            "Sabedoria" : 8,
            "Inteligencia" : 8,
            "Carisma" : 8
        }

        self.conjunto_custo_atributos = {
            8 : 0,
            9 : 1,
            10 : 2,
            11 : 3,
            12 : 4,
            13 : 5,
            14 : 7,
            15 : 9
        }


class DistribuirEscolha27(DistribuirPontosStrategy):
    def __init__(self, classe_atributos):
        self.conjunto_atributos = classe_atributos.conjunto_atributos
        self.conjunto_custo_atributos = classe_atributos.conjunto_custo_atributos
        self.pontos_disponiveis = 27

    # Confere se o valor está entre 8 e 15
    def confere_entre_8_e_15(self, nome_atributo, valor):
        if (valor >= 8 and valor <= 15):
            return valor
        else:
            raise ValueError(f"O valor {valor} de {nome_atributo} é inválido (tem que estar entre 8 e 15)")
    
    # Confere se ainda está dentro do limite de 27 pontos para a distribuição
    def confere_pontos_disponiveis(self, valor):
        verifica_gasto = self.pontos_disponiveis - self.conjunto_custo_atributos[valor]
        if verifica_gasto >= 0:
            self.pontos_disponiveis -= self.conjunto_custo_atributos[valor]
        else:
            raise ValueError(f"Você ultrapassou o limite de 27 pontos disponíveis!!")

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self, nome_atributo, valor):
        if nome_atributo in self.conjunto_atributos:
            self.confere_pontos_disponiveis(valor)
            self.conjunto_atributos[nome_atributo] = self.confere_entre_8_e_15(nome_atributo, valor)
        else:
            print(f"Atributo {nome_atributo} não encontrado.")


class Humano(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Forca'] += 1
        self.conjunto_atributos['Destreza'] += 1
        self.conjunto_atributos['Constituicao'] += 1
        self.conjunto_atributos['Sabedoria'] += 1
        self.conjunto_atributos['Inteligencia'] += 1
        self.conjunto_atributos['Carisma'] += 1

class AnaoDaMontanha(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Forca'] += 2
        self.conjunto_atributos['Constituicao'] += 2

class Draconato(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Forca'] += 2
        self.conjunto_atributos['Carisma'] += 1

class MeioOrc(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Forca'] += 2
        self.conjunto_atributos['Constituicao'] += 1

class Elfo(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Forca'] += 2
        self.conjunto_atributos['Constituicao'] += 1

class Halfling(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Destreza'] += 2

class AltoElfo(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Destreza'] += 2
        self.conjunto_atributos['Inteligencia'] += 1

class GnomoDaFloresta(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Destreza'] += 1

class GnomoDasRochas(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Constituicao'] += 1

class Anao(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Constituicao'] += 2

class HalflingRobusto(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Constituicao'] += 1

class Gnomo(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Inteligencia'] += 2

class Tiefling(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Inteligencia'] += 1
        self.conjunto_atributos['Carisma'] += 1

class Tiefling(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Inteligencia'] += 1
        self.conjunto_atributos['Carisma'] += 1

class AnaoDaColina(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Sabedoria'] += 1

class ElfoDaFloresta(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Sabedoria'] += 1

class Drow(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Carisma'] += 1

class HalflingPesLeves(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Carisma'] += 1

class MeioElfo(DistribuirPontosStrategy):
    def __init__(self, classe_distribuirEscolha27):
        self.conjunto_atributos = classe_distribuirEscolha27.conjunto_atributos
        self.set_atributo()

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos:
            return self.conjunto_atributos.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."

    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        self.conjunto_atributos['Carisma'] += 2


class ModificadorAtributo(DistribuirPontosStrategy):
    def __init__(self, classe_raca_qualquer):
        self.pontos_vida = 10

        self.conjunto_atributos_raca = classe_raca_qualquer.conjunto_atributos
        
        self.conjunto_modificadores_personagem = {}

        self.conjunto_valores_modificador = {
            1 : -5,
            2 : -4,
            3 : -4,
            4 : -3,
            5 : -3,
            6 : -2,
            7 : -2,
            8 : -1,
            9 : -1,
            10 : 0,
            11 : 0,
            12 : 1,
            13 : 1,
            14 : 2,
            15 : 2,
            16 : 3,
            17 : 3,
            18 : 4,
            19 : 4,
            20 : 5,
            21 : 5,
            22 : 6,
            23 : 6,
            24 : 7,
            25 : 7,
            26 : 8,
            27 : 8,
            28 : 9,
            29 : 9,
            30 : 10
        }

    # Faz os calculos das modificações e guarda em um dicionário
    def calculaModificacao(self):
        modificador_forca = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Forca']]
        modificador_destreza = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Destreza']]
        modificador_constituicao = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Constituicao']]
        modificador_sabedoria = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Sabedoria']]
        modificador_inteligencia = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Inteligencia']]
        modificador_carisma = self.conjunto_valores_modificador[self.conjunto_atributos_raca['Carisma']]

        self.conjunto_modificadores_personagem['Modificador_Forca'] = modificador_forca
        self.conjunto_modificadores_personagem['Modificador_Destreza'] = modificador_destreza
        self.conjunto_modificadores_personagem['Modificador_Constituicao'] = modificador_constituicao
        self.conjunto_modificadores_personagem['Modificador_Sabedoria'] = modificador_sabedoria
        self.conjunto_modificadores_personagem['Modificador_Inteligencia'] = modificador_inteligencia
        self.conjunto_modificadores_personagem['Modificador_Carisma'] = modificador_carisma

        self.pontos_vida += self.conjunto_modificadores_personagem['Modificador_Constituicao']

    # Getter para obter os pontos de vida
    def get_pontos_vida(self):
        return self.pontos_vida
    
    # Getter para obter o valor de um modificador específico
    def get_modificador(self, nome_atributo):
        modificador = "Modificador_" + nome_atributo
        if modificador in self.conjunto_modificadores_personagem:
            return self.conjunto_modificadores_personagem.get(modificador)
        else:
            return f"{modificador} não encontrado."

    # Getter para obter o valor de um atributo específico
    def get_atributo(self, nome_atributo):
        if nome_atributo in self.conjunto_atributos_raca:
            return self.conjunto_atributos_raca.get(nome_atributo)
        else:
            return f"Atributo {nome_atributo} não encontrado."
        
    # Setter para modificar o valor de um atributo específico
    def set_atributo(self):
        pass


class Personagem:
    def __init__(self, classe_raca_qualquer, forca, destreza, constituicao, sabedoria, inteligencia, carisma):

        atributos = Atributos()

        distribuirEscolha27 = DistribuirEscolha27(atributos)

        distribuirEscolha27.set_atributo('Forca', forca)
        distribuirEscolha27.set_atributo('Destreza', destreza)
        distribuirEscolha27.set_atributo('Constituicao', constituicao)
        distribuirEscolha27.set_atributo('Sabedoria', sabedoria)
        distribuirEscolha27.set_atributo('Inteligencia', inteligencia)
        distribuirEscolha27.set_atributo('Carisma', carisma)

        self.raca = classe_raca_qualquer(distribuirEscolha27)

        self.modificadorAtributo = ModificadorAtributo(self.raca)
        self.modificadorAtributo.calculaModificacao()

    def mostra_info(self):
        print(f"\nPONTOS DE VIDA: {self.modificadorAtributo.get_pontos_vida()}\n")
        print("ATRIBUTOS:\n")
        print(f"FORÇA: {self.raca.get_atributo('Forca')}")
        print(f"DESTREZA: {self.raca.get_atributo('Destreza')}")
        print(f"CONSTITUIÇÃO: {self.raca.get_atributo('Constituicao')}")
        print(f"SABEDORIA: {self.raca.get_atributo('Sabedoria')}")
        print(f"INTELIGÊNCIA: {self.raca.get_atributo('Inteligencia')}")
        print(f"CARISMA: {self.raca.get_atributo('Carisma')}")
        print("\nMODIFICADORES DE ATRIBUTOS\n")
        print(f"MODIFICADOR_FORÇA: {self.modificadorAtributo.get_modificador('Forca')}")
        print(f"MODIFICADOR_DESTREZA: {self.modificadorAtributo.get_modificador('Destreza')}")
        print(f"MODIFICADOR_CONSTITUIÇÃO: {self.modificadorAtributo.get_modificador('Constituicao')}")
        print(f"MODIFICADOR_SABEDORIA: {self.modificadorAtributo.get_modificador('Sabedoria')}")
        print(f"MODIFICADOR_INTELIGÊNCIA: {self.modificadorAtributo.get_modificador('Inteligencia')}")
        print(f"MODIFICADOR_CARISMA: {self.modificadorAtributo.get_modificador('Carisma')}")



personagem = Personagem(AltoElfo, 8, 8, 8, 15, 15, 15)
personagem.mostra_info()
