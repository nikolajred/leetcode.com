package com.company;

class SolutionEasy {
    static int[] num = {1, 5, 6, 9, 12};
    static String s = "MCMXCIV";
    static int number = 1000000001;

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        exit:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    break exit;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    public static int reversNumber(int number) {
        int result = 0;
        long reversNumber = 0;
        exit:
        while (Math.abs(number) > 0) {
            int elementNumber = number % 10;
            reversNumber += elementNumber;
            reversNumber *= 10;
            number /= 10;
            if (Math.abs(reversNumber / 10) > Integer.MAX_VALUE) {
                result = 0;
                break exit;
            }

            result = (int) (reversNumber / 10);
        }
        System.out.println(result);
        return result;
    }

    public static int romanToInt(String s) {
        char[] result = s.toCharArray();
        int[] intResult = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
                case 'I':
                    intResult[i] = 1;
                    break;
                case 'V':
                    intResult[i] = 5;
                    break;
                case 'X':
                    intResult[i] = 10;
                    break;
                case 'L':
                    intResult[i] = 50;
                    break;
                case 'C':
                    intResult[i] = 100;
                    break;
                case 'D':
                    intResult[i] = 500;
                    break;
                case 'M':
                    intResult[i] = 1000;
                    break;
                default:
                    break;
            }
        }
        for (int j = 0; j < result.length; j++) {
            for (int k = j + 1; k < result.length; k++) {
                if (Math.abs(intResult[j]) < Math.abs(intResult[k])) {
                    intResult[j] *= (-1);
                }
            }

        }
        int resultInteger = 0;
        for (int j = 0; j < intResult.length; j++) {
             resultInteger+=intResult[j];
            System.out.println(intResult[j]);
        }
        System.out.println(resultInteger);
        return resultInteger;
    }

    public static boolean isPalindrome(int number) {
        int Nnumber = number;
        int someNumber = 0;
        long palidromNumber = 0;
        int resultPalindromNumber = 0;
        boolean result=false;
        while(Math.abs(Nnumber)>0){
            someNumber = Nnumber%10;
            palidromNumber += someNumber;
            palidromNumber*=10;
            Nnumber/=10;

        }
        resultPalindromNumber =(int) (palidromNumber/10);
        if(Math.abs(resultPalindromNumber)==Math.abs(number)&&number>0){
            result = true;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        twoSum(num, 7);
        reversNumber(-2143847412);
        romanToInt(s);
        isPalindrome(number);
    }
}
