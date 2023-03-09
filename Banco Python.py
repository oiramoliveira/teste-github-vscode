"""
Especificação de Requisitos do Projeto

O projeto deve conter os principais temas ensinados durante o curso cada um valendo 1 ponto:
Estruturas de decisão 
Laços de repetição 
Estrutura de dado(pelo menos uma seja lista array,dicionario, arvore,grafo)
Funções ok
Classes ok
Herança
Polimorfismo
Persistencia atraves de leitura e escrita em algum documento(3 pts)

Opcionais valendo pontos extras:
Recursão(1 pt) 
Datas(1 pt)
Interfaces graficas(2 Pts
"""
from tkinter import *
from tkinter import ttk

class logIn:
    def __init__(self, usuario, senha):
        self.usuario = usuario
        self.senha = senha

        usuario = input("Digite seu usuário: ")
        senha = input("Digite sua senha: ")

        

class Clientes:
    def __init__(self, nome, cpf):
        self.nome = nome
        self.cpf = cpf


class Contas:
    def __init__(self, agencia, conta):
        self.agencia = agencia
        self.conta = conta

    

    

class Correntitas(Clientes):
    def __init__(self, cnome, ccpf):
        super().__init__(cnome, ccpf)





        




tela1 = Tk()
tela1.geometry("400x400")
tela1.configure(background= "orange")
frm = ttk.Frame(tela1, width=500, height=500  )
frm.grid()
ttk.Label(frm, text="Usuário").grid(column=0, row=0)
ttk.Label(frm, text="Senha").grid(column=0, row=1)
ttk.Button(frm, text="Entrar", command=tela1.destroy).grid(column=1, row=3)
ttk.Button(frm, text="Recuperar senha", command=tela1.destroy).grid(column=2, row=3)
ttk.Button(frm, text="Sair", command=tela1.destroy).grid(column=1, row=4)
tela1.mainloop()
