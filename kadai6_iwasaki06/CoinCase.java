package com.company;

public class CoinCase {
    int five_hundred = 0;
    int one_hundred = 0;
    int fifty = 0;
    int ten = 0;
    int five = 0;
    int one = 0;

    public void AddCoins(int type, int count) {
        switch (type) {
            case 500:
                five_hundred += count;
                break;
            case 100:
                one_hundred += count;
                break;
            case 50:
                fifty += count;
                break;
            case 10:
                ten += count;
                break;
            case 5:
                five += count;
                break;
            case 1:
                one += count;
                break;
        }
    }

    public int GetCount(int type) {
        switch (type) {
            case 500:
                return five_hundred;
            case 100:
                return one_hundred;
            case 50:
                return fifty;
            case 10:
                return ten;
            case 5:
                return five;
            case 1:
                return one;
        }
    return 0;
    }

        public int GetAmount () {
            return (five_hundred * 500)
                    + (one_hundred * 100)
                    + (fifty * 50)
                    + (ten * 10)
                    + (five * 5)
                    + one;
        }
    }

