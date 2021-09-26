package co.com.sofka.app.domain.cinema.function.value;

import co.com.sofka.domain.generic.Identity;

public class RoomId extends Identity {
    public RoomId() {

    }
    private RoomId(String id){
        super(id);
    }

    public static RoomId of(String id){
        return new RoomId(id);
    }
}
