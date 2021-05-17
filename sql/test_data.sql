INSERT INTO CLIENT
(last_name, first_name, middle_name, birthday, passport_number, address_registration, address_residential, mobile_phone, email)
VALUES
('Pechorin', 'Grigory', 'Alexandrovich', '1985-01-25','0001224466', 'Saratov', 'Saratov', '8-900-01-01', 'yyyy@mail.ru');

INSERT INTO CLIENT
(last_name, first_name, middle_name, birthday, passport_number, address_registration, address_residential, mobile_phone, email)
VALUES
('Ivanov', 'Egor', 'Sergeyevich', '1986-02-25','0002335577', 'Saratov', 'Saratov', '8-900-01-02', 'pppp@mail.ru');

INSERT INTO ACCOUNT
(id_client, account_number, type_account)
VALUES
('1', '640001', 'current');

INSERT INTO ACCOUNT
(id_client, account_number, type_account)
VALUES
('1', '640002', 'accumulative');


INSERT INTO ACCOUNT
(id_client, account_number, type_account)
VALUES
('2', '640003', 'current');

INSERT INTO ACCOUNT
(id_client, account_number, type_account)
VALUES
('2', '640004', 'accumulative');


INSERT INTO ACCOUNT_BALANCE
(id_account, currency, money)
VALUES
('1', 'rub', 100000.00);

INSERT INTO ACCOUNT_BALANCE
(id_account, currency, money)
VALUES
('2', 'rub', 0);

INSERT INTO ACCOUNT_BALANCE
(id_account, currency, money)
VALUES
('3', 'rub', 200000);

INSERT INTO ACCOUNT_BALANCE
(id_account, currency, money)
VALUES
('4', 'rub', 0);

INSERT INTO "TEST"."APPLICATION"
(ID_CLIENT, FROM_ACCOUNT, TO_ACCOUNT, MONEY, CREATION_DATE)
VALUES ('1', '1', '3', '5000', TO_DATE('2021-05-14 18:39:01', 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO "TEST"."TRANSACTION"
(FROM_ACCOUNT, TO_ACCOUNT, STATUS, DATE_EXECUTION)
VALUES ('1', '3', 'successful', TO_DATE('2021-05-14 18:43:24', 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO "TEST"."PAYMENT" (
    ID_PAYMENT, ID_APP, ID_TRANSACTION, MONEY, PAYMENT_STATUS)
VALUES ('1', '1', '1', '5000', 'successful');

INSERT INTO "TEST"."AUDIT_PAY"
(ID_PAYMENT, STATUS)
VALUES ('1', 'successful');
