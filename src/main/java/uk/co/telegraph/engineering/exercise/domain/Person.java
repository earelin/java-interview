package uk.co.telegraph.engineering.exercise.domain;

public interface Person {
  Long getId();

  void setId(Long id);

  String getFirstName();

  void setFirstName(String firstName);

  String getLastName();

  void setLastName(String lastName);
}
