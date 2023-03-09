import tkinter as tk

class BankApp:
    def __init__(self, master):
        self.master = master
        master.title("Banco App")

        self.balance = 0
        self.balance_label = tk.Label(master, text="Saldo: R$ {:.2f}".format(self.balance))
        self.balance_label.pack()

        deposit_frame = tk.Frame(master)
        deposit_frame.pack()
        deposit_label = tk.Label(deposit_frame, text="Depositar: R$")
        deposit_label.pack(side='left')
        self.deposit_entry = tk.Entry(deposit_frame)
        self.deposit_entry.pack(side='left')
        deposit_button = tk.Button(deposit_frame, text="Depositar", command=self.deposit)
        deposit_button.pack(side='left')

        withdraw_frame = tk.Frame(master)
        withdraw_frame.pack()
        withdraw_label = tk.Label(withdraw_frame, text="Retirar: R$")
        withdraw_label.pack(side='left')
        self.withdraw_entry = tk.Entry(withdraw_frame)
        self.withdraw_entry.pack(side='left')
        withdraw_button = tk.Button(withdraw_frame, text="Retirar", command=self.withdraw)
        withdraw_button.pack(side='left')

    def deposit(self):
        amount = float(self.deposit_entry.get())
        self.balance += amount
        self.balance_label.config(text="Saldo: R$ {:.2f}".format(self.balance))

    def withdraw(self):
        amount = float(self.withdraw_entry.get())
        if amount > self.balance:
            messagebox.showerror("Erro", "Não há fundos suficientes para a retirada.")
        else:
            self.balance -= amount
            self.balance_label.config(text="Saldo: R$ {:.2f}".format(self.balance))

root = tk.Tk()
app = BankApp(root)
root.mainloop()
