public class Internal extends Storage{

    public Data persistent_save(char ch){

        Data d= new Data();
        d = d.internal(ch);
        return d;
    }

    public int capacity(char ch){

        switch(ch){

            case 'L':
                return 1024;
            case 'D':
                return 1024;
            case 'T':
                return 256;
            case 'M':
                return 64;
            default:
                return -999;                                                
    

    }
}}