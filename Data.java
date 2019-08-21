
public class Data{

    int documents_storage;
    int music_storage;
    int media_storage;
    int applications_storage;

    public Data internal (char ch){

        switch(ch){

            case 'D':
                documents_storage = 50;
                music_storage = 100;
                media_storage = 100;
                applications_storage = 200;
                return this;

            case 'L':
                documents_storage = 100;
                music_storage = 200;
                media_storage = 200;
                applications_storage = 500;
                return this;

            case 'T':
                documents_storage = 25;
                music_storage = 50;
                media_storage = 50;
                applications_storage = 100;  
                return this; 

            case 'M':
                documents_storage = 10;
                music_storage = 10;
                media_storage = 10;
                applications_storage = 30;
                return this;
                
            default:
                return this;    
        }
    }

    public Data external (char ch) {
        switch(ch){

            case 'U':
            documents_storage= 10;
            music_storage= 15;
            media_storage= 15;
                return this;

            case 'D':
            documents_storage= 100;
            music_storage= 200;
            media_storage= 200;
                return this;

            case 'M':
            documents_storage = 8;
            music_storage = 8;
            media_storage = 16;

            default:
                return this;    



        }

    }  


}