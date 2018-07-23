package Child;

import request.MotherRequest;

public class Ania extends Child{

    private static final String NAME = "Ania";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)){
            System.out.println(NAME + " sciąga majtki");
        }
        else getTallerChild().processRequest(motherRequest);



    }
}
