package org.example.design_patterns.povedencheskie.iterator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JavaDeveloper implements Collection{

    private String name;
    private String [] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new skillIterator();
    }

    private class skillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
