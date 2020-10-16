DROP USER IF EXISTS 'blogapi'@'localhost';

CREATE USER IF NOT EXISTS 'blogapi'@'localhost'

IDENTIFIED BY 'blogapibytega4321';

GRANT ALL PRIVILEGES ON blogapi.* TO 'blogapi'@'localhost';

FLUSH PRIVILEGES;