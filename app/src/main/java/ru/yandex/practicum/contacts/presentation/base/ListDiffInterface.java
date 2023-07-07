package ru.yandex.practicum.contacts.presentation.base;

//import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi; //todo удалить, не используется

public interface ListDiffInterface<T> {




    <ListDiffInterface> boolean theSameAs(T object);

    boolean equals(Object listDiffInterfaceObject);// при установки условия о необходимости переопределения equals, нужно переопределять метод hashCode

    //int hashCode();
}
