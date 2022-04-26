package kulhavy;

public final class TimeTools {
    
    private TimeTools(){}
    
    /**
     * Převede zformátovaný čas zadaný v řetězci na počet vteřin
     * @param time String s časem ve tvaru 00:00:00 – hodiny:minuty:vteřiny
     * @return Počet vteřin typu long
     */
    public static long stringToLong(String time) {        
        String[] parts = time.split(":");
        
        long multiplier = 1;
        long rtrn = 0;
        
        for (int i = 2; i >= 0; i--) {
            rtrn += Long.parseLong(parts[i]) * multiplier;
            multiplier *= 60;
        }  
        
        return rtrn;
    }
    
    /**
     * Převede čas zadaný třema integerama na počet vteřin
     * @param hours Počet hodin
     * @param minutes Počet minut
     * @param seconds Počet vteřin
     * @return Počet vteřin typu long
     */
    public static long intsToLong(int hours, int minutes, int seconds) {
        return 3600 * hours + 60 * minutes + seconds;
    }
    
    /**
     * Převede počet vteřin na zformátovaný zápis času
     * @param time Počet vteřin typu long
     * @return String s časem ve tvaru 00:00:00 – hodiny:minuty:vteřiny
     */
    public static String longToString(long time) {
        long hours = time / 3600;
        long minutes = (time % 3600) / 60;
        long seconds = time % 60;        
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
}
