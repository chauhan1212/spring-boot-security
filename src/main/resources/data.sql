INSERT INTO users (username, password, enabled) VALUES
  ('vijay', 'pass', true);
INSERT INTO users (username, password, enabled) VALUES
  ('ajay', 'pass', true);

INSERT INTO authorities (username, authority) VALUES
  ('vijay','ROLE_USER');
INSERT INTO authorities (username, authority) VALUES
  ('ajay','ROLE_ADMIN');