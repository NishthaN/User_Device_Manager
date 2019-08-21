public class External extends Storage{

    public Data persistent_save(char ch){

        Data d = new Data();
        d = d.external(ch);
        return d;
    }
    
    public int capacity(char ch){

        switch(ch){

            case 'U':
                return 16;
            case 'H':
                return 1000;
            case 'M':
                return 32;
            default:
            return -999;
        }
    }
}