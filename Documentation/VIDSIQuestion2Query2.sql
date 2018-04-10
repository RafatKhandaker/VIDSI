ALTER TABLE Subscriber_Log ADD PRIMARY KEY(Subscriber_Id, Content_View_URI);
ALTER TABLE Subscriber_Log DROP PRIMARY KEY;

TRUNCATE TABLE Subscriber_Log;

INSERT Subscriber_Log VALUES(1, 'http://localhost/test1', 25);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test2', 20);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test3', 15);

INSERT Subscriber_Log VALUES(2, 'http://localhost/test1', 35);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test2', 21);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test3', 17);

INSERT Subscriber_Log VALUES(3, 'http://localhost/test1', 5);
INSERT Subscriber_Log VALUES(3, 'http://localhost/test2', 27);
INSERT Subscriber_Log VALUES(3, 'http://localhost/test3', 36);


SELECT Subscriber_Id, Content_View_URI, Times_Viewed FROM Subscriber_Log
ORDER BY Times_Viewed DESC
LIMIT 20;
