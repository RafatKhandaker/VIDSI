ALTER TABLE Subscriber_Log DROP FOREIGN KEY FK_SubscriberLogId ;
ALTER TABLE Subscriber_Log DROP PRIMARY KEY;

INSERT Subscriber_Log VALUES(1, 'http://localhost/test1', 25);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test2', 20);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test3', 15);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test4', 10);
INSERT Subscriber_Log VALUES(1, 'http://localhost/test5', 5);

INSERT Subscriber_Log VALUES(2, 'http://localhost/test4', 23);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test2', 21);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test5', 30);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test1', 10);
INSERT Subscriber_Log VALUES(2, 'http://localhost/test3', 7);

INSERT Subscriber_Log VALUES(3, 'http://localhost/test2', 45);
INSERT Subscriber_Log VALUES(3, 'http://localhost/test3', 27);
INSERT Subscriber_Log VALUES(5, 'http://localhost/test1', 12);
INSERT Subscriber_Log VALUES(3, 'http://localhost/test5', 11);
INSERT Subscriber_Log VALUES(5, 'http://localhost/test1', 14);

SELECT * FROM Subscriber_Log;

SELECT Subscriber_Id, Content_View_URI, Times_Viewed  
FROM Subscriber_Log
ORDER BY Times_Viewed DESC
LIMIT 20;

SELECT Subscriber_Id, Content_View_URI, COUNT( Content_View_URI) AS Times_View
FROM Subscriber_Log
GROUP BY  Subscriber_Id, Content_View_URI 
ORDER BY Times_View DESC
LIMIT 20;
