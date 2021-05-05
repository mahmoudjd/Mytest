import os
from multiprocessing import Process


def run(name):
    print 'Name: ', name
    if hasattr(os, "getppid"):
        print 'PPID : ', os.getppid()
    print 'PID : ', os.getpid()


def f(title):
    run(title)


if __name__ == '__main__':
    run('haupt line')
    p = Process(target=f, args=('hi',))
    p.start()
    p.join()
