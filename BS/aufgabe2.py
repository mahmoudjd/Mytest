from multiprocessing import Process, RawValue, RawArray
import ctypes

arr = RawArray(ctypes.c_int, range(20))  # feld mit Lange 20


def prozess(n, test):
    wert = RawValue(ctypes.c_int, 0)  # 0 mit ctype integer
    if test == 0:               # hier prueft, ob test = 0 ist dann fuert den ersten Prozess aus falls true
        for i in range(10):  # for schleife bis 10 mal, um den Wert 1 in den ersten 10_Indexe zu setzen
            arr[i] = wert.value + n  # in array den Wert in passenden index speichern
    if test == 1:           # prueft , ob test = 1 ist , dann  fuehrt den zweiten Prozess aus , falls true
        for i in range(10, 20):   # for schleife von 10 bis 20 mal, um den Wert 2 in den letzten 10_Indexe zu setzen
            arr[i] = wert.value + n


if __name__ == '__main__':

    ''' Process mit zwei parameter erste name des Prozesses und Argumente
            Wert 1 und nummer 0 um den ersten Prozess auszufuehren '''

    x = RawValue(ctypes.c_int, 1)
    y = RawValue(ctypes.c_int, 2)

    p1 = Process(target=prozess, args=(x.value, 0))

    ''' Process mit zwei parameter erste name des Prozesses und Argumente
                 Wert 2 und nummer 1 um den zweiten Prozess auszufuehren'''
    p2 = Process(target=prozess, args=(y.value, 1))

    p1.start()
    # startet den ersten Prozess

    p2.start()
    # startet den zweiten Prozess

    p1.join()
    # endet den ersten Prozess
    p2.join()
    # endet den zweiten Prozess

    print arr[:]
    # Array ausgeben
