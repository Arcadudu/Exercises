package com.company.LootingLockers;

import java.util.Random;

public class Ex14_Locker {
    public static void main(String[] args) {
//      есть 3 шкафчика под номерами
//      59 60 61
//      и три ключа, которые имеют номер,
//      введенный пользователем.
//      каждый ключ открывает и закрывает
//      только шкафчик с тем же номером, что и у ключа.
//      также есть мастер-ключ, который
//      открывает любой шкафчик

//      в каждом из шкафчиков находится определенный предмет
//      из списка, определенного для данного шкафчика.
//      какой именно предмет окажется внутри того или иного шкафчика,
//      определяется псевдо-случайно.

//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);

        // Доступные объекты //
        Locker locker59 = new Locker(59, true);
        Locker locker60 = new Locker(60, true);
        Locker locker61 = new Locker(61, true);

        Key key59 = new Key(59);
        Key key60 = new Key(60);
        Key key61 = new Key(61);

        MasterKey msKey = new MasterKey(0);

        Loot loot = new Loot();
        /////////////////////////////////////////

        locker59.getInfo();
        locker60.getInfo();
        locker61.getInfo();

        key59.useKey(locker59);
        msKey.useKey(locker60);
        key61.useKey(locker61);

        loot.getLoot(locker59);
        loot.getLoot(locker60);
        loot.getLoot(locker61);


    }
}

class Key {
    private int keyName;
    private int keyNumber;

    public Key(int name) {
        this.keyName = name;
        this.keyNumber = name;
    }

    public int getKeyName() {
        return keyName;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public void useKey(Locker locker) {
        System.out.println("Используем ключ " + getKeyNumber() + " к шкафчику " + locker.getLockerName() + "...");
        if (getKeyNumber() == locker.getLockerNumber() && locker.isLockerClosed()) {
            locker.openLocker();
            System.out.println("Шкафчик " + locker.getLockerNumber() + " открыт ключом " + getKeyNumber() + "\n");
        } else if (getKeyNumber() == locker.getLockerNumber() && !locker.isLockerClosed()) {
            locker.closeLocker();
            System.out.println("Шкафчик " + locker.getLockerNumber() + " закрыт ключом " + getKeyNumber() + "\n");
        } else {
            System.out.println("Ключ " + getKeyNumber() + " не подходит к шкафчику " + locker.getLockerNumber() + "\n");

        }
    }
}

class MasterKey extends Key {

    public MasterKey(int name) {
        super(name);
    }

    @Override
    public void useKey(Locker locker) {
        System.out.println("Используем Мастер-ключ к шкафчику " + locker.getLockerName() + "...");
        if (locker.getMasterID() == 0 && locker.isLockerClosed()) {
            locker.openLocker();
            System.out.println("Шкафчик " + locker.getLockerName() + " открыт Мастер-ключом" + "\n");
        } else if (locker.getMasterID() == 0 && !locker.isLockerClosed()) {
            locker.closeLocker();
            System.out.println("Шкафчик " + locker.getLockerName() + " закрыт Мастер-ключом" + "\n");
        } else {
            System.out.println("Ошибка" + "\n");
        }

    }
}


class Locker {

    private final int lockerName;
    private final int lockerNumber;
    private boolean lockerClosed;
    private static int masterID;

    public Locker(int lockerName, boolean lockerClosed) {
        this.lockerName = lockerName;
        this.lockerNumber = lockerName;
        this.lockerClosed = lockerClosed;
        masterID = 0;
    }

    public int getMasterID() {
        return masterID;
    }

    public int getLockerName() {
        return lockerName;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean isLockerClosed() {
        return lockerClosed;
    }

    public void getInfo() {
        System.out.println("Номер шкафчика: " + getLockerName());
        System.out.println("Шифр шкафчика: " + getLockerNumber());
        if (isLockerClosed()) {
            System.out.println("Шкафчик закрыт");
        } else {
            System.out.println("Шкафчик открыт");
        }
        System.out.println();
    }

    public void openLocker() {
        if (isLockerClosed()) {
            lockerClosed = false;
        } else {
            System.out.println("Шкафчик уже открыт");
        }
        System.out.println();
    }

    public void closeLocker() {
        if (!isLockerClosed()) {
            lockerClosed = true;
        } else {
            System.out.println("Шкафчик уже закрыт");
        }
        System.out.println();
    }
}
