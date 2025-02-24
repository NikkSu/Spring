package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical Music";
    }
}