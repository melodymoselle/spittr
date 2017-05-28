package com.melodymoselle.spittr.data;

import com.melodymoselle.spittr.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
