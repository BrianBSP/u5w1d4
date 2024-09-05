package brianpelinku.u5w1d4.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(long id){
        super("Il record con l'Id " + id + " non é stato trovato nel DB!");
    }
}
