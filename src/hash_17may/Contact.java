package hash_17may;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> email = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public String getName() {
        return name;
    }

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0L);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        this.email.add(email);
        this.phones.add(String.valueOf(phone));
        if (phone > 0) {
            String phoneFormat = String.valueOf(phone);
            String formatedPhoneNumber = String.format("(%s) %s-%s", phoneFormat.substring(0, 3), phoneFormat.substring(3, 6), phoneFormat.substring(6, 10));
            System.out.printf("formated phone number is %s", formatedPhoneNumber);
        }

    }


    @Override
    public String toString() {
        return "[ name " + name + ", phone " + phones + ", email " + email + " ]";
    }

    public Contact mergeContactData(Contact contact) {
        Contact contact1 = new Contact(name);
        contact1.email = new HashSet<>(this.email);
        contact1.phones = new HashSet<>(this.phones);
        contact1.email.addAll(contact.email);
        contact1.phones.addAll(contact.phones);
        return contact1;
    }

}
