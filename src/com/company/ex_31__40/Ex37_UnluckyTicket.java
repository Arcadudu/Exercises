package com.company.ex_31__40;

public class Ex37_UnluckyTicket {
    public static void main(String[] args) {
//        Назовем автобусный билет несчастливым,
//        если сумма цифр его шестизначного номера делится на 13.
//        Могут ли два идущих подряд билета оказаться несчастливыми?

        int ticket; // ПЕРЕМЕННАЯ, ОБОЗНАЧАЮЩАЯ НОМЕР БИЛЕТА

// НИЖЕ НАХОДИТСЯ ЦИКЛ ПЕРЕБОРА ОТ 100000 ДО 999999. ОН ПЕРЕБИРАЕТ ВСЕ ЧИСЛА
        for (ticket = 100000; ticket < 999999; ticket++) {
            String str = Integer.toString(ticket);

            int a = Integer.parseInt(str.substring(0, 1));
            int b = Integer.parseInt(str.substring(1, 2));
            int c = Integer.parseInt(str.substring(2, 3));
            int d = Integer.parseInt(str.substring(3, 4));
            int e = Integer.parseInt(str.substring(4, 5));
            int f = Integer.parseInt(str.substring(5, 6));
            int sum = a + b + c + d + e + f;

            if (sum % 13 == 0) {
                int ticketNext = ticket + 1;
                String str1 = Integer.toString(ticketNext);
                int a1 = Integer.parseInt(str1.substring(0, 1));
                int b1 = Integer.parseInt(str1.substring(1, 2));
                int c1 = Integer.parseInt(str1.substring(2, 3));
                int d1 = Integer.parseInt(str1.substring(3, 4));
                int e1 = Integer.parseInt(str1.substring(4, 5));
                int f1 = Integer.parseInt(str1.substring(5, 6));
                int sum1 = a1 + b1 + c1 + d1 + e1 + f1;
                if (sum1 % 13 == 0) System.out.println(ticket + " " + ticketNext);

            }


        }
    }
}
