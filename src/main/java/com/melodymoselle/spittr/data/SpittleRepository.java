package com.melodymoselle.spittr.data;

import com.melodymoselle.spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
