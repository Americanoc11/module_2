package ss12_java_collection_framework.bai_tap.used_mvc.repository;

import ss9_dsa_list.bai_tap.excercise.model.Intructor;

public interface IIntructorRepo {
    void deleted(int id);

    void display();

    void add(Intructor intructor);
}
