from tkinter import *


def CreateList(grocery):
    for elem in grocery:
        theList.insert(END, elem[0] + "-" + str(elem[1]))


def listguide(grocery, item):
    index = -1
    for i in range(len(grocery)):
        if grocery[i][0] == item:
            index = i

    return index


def addList(grocery, item, index):
    if index == -1:
        grocery.append([item, 1])
    else:
        grocery[index][1] += amount.get()


def removeList(shopping, index):
    del (grocery[index])


def add():
    index = listguide(grocery, item.get())
    addList(grocery, item.get(), index)
    if index >= 0:
        theList.delete(index)
        theList.insert(index, grocery[index][0] + "-" + str(grocery[index][1]))
    else:
        theList.insert(END, item.get() + "-" + str(amount.get()))


def remove():
    index = theList.index(ACTIVE)
    print(index)
    removeList(grocery, index)
    theList.delete(index)


grocery = [["Soda", 10], ["Milk", 2], ["Chips", 1], ["Cookies", 2], ["Bread", 1]]

Grocery = Tk()
Grocery.title("Smart List")
Grocery.geometry("300x300")
Grocery.configure(bg='black')
Grocery.resizable(False, False)

theList = Listbox(Grocery, selectmode=SINGLE, bg='#856ff8')
theList.grid(row=0, column=0, columnspan=2, sticky=E)

CreateList(grocery)
item = StringVar()
amount = IntVar()

amount.set(0)

Label(Grocery, text="Grocery:", bg='#856ff8').grid(row=1, column=0, sticky=E, )
Entry(Grocery, textvariable=item).grid(row=1, column=1, sticky=W)

Label(Grocery, text="Quantity:", bg='#856ff8').grid(row=2, column=0, sticky=E)
Entry(Grocery, textvariable=amount).grid(row=2, column=1, sticky=W)


Button(Grocery, text="Add", command=add, bg='#856ff8').grid(row=3, column=0, columnspan=3)
Button(Grocery, text="Remove", command=remove, bg='#856ff8').grid(row=0, column=3)


Grocery.mainloop()
