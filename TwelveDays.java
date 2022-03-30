class TwelveDays {
    String [] post={" a Partridge in a Pear Tree.\n"," two Turtle Doves,"," three French Hens,"," four Calling Birds,"," five Gold Rings,"," six Geese-a-Laying,"," seven Swans-a-Swimming,"," eight Maids-a-Milking,"," nine Ladies Dancing,"," ten Lords-a-Leaping,"," eleven Pipers Piping,"," twelve Drummers Drumming,"};
    String [] day={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String pre(int verseNumber){
        String t="";
        if(verseNumber>1){
            for(int i=verseNumber-2;i>=1;i--){
                t=t+post[i];
            }
            t=t+" and a Partridge in a Pear Tree.\n";

        }return t;
    }

    String verse(int verseNumber) {
        String lyrics="";
        lyrics="On the "+day[verseNumber-1]+" day of Christmas my true love gave to me:"+post[verseNumber-1];
        if(verseNumber>1){
            lyrics+=pre(verseNumber);
        }
        else{
            lyrics=lyrics;
        }
        return lyrics;
    }
        /*switch(verseNumber){
            case 1:
              return "first";

            case 2:
              return "second";

            case 3:
              return "third";

            case 4:
              return "fourth";

            case 5:
              return "fifth";

            case 6:
              return "sixth";

            case 7:
              return "seventh";

            case 8:
              return "eighth";

            case 9:
              return "ninth";

            case 10:
              return "tenth";

            case 11:
              return "eleventh";

            case 12 :
              return "twelfth";

            default:
                return "none";
        }*/


    String verses(int startVerse, int endVerse) {
        String s="";
        for(int i=startVerse;i<=endVerse;i++){
            if(i!= startVerse){
                s+="\n" + verse(i);
            }
            else{
                s=s+verse(i);
            }
        }
        return s;
    }

    String sing() {
        return verses(1,12);

    }
}
