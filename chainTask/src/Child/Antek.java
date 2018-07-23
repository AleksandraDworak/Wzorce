package Child;

import request.MotherRequest;

public class Antek extends Child{

    private static final String NAME = "Antek";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println(NAME + " sciąga majtki");
        }
        else getTallerChild().processRequest(motherRequest);



    }
}
