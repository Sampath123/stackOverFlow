import MySQLdb
import json
import requests

con = MySQLdb.connect(host="localhost",
                    user="root", 
                    passwd="hasher123", 
                    db="commentStack")
cur = con.cursor()


def read_comments():
    startpage=346
    endpage=5959
    for pgcount in range(startpage,endpage):
        print pgno
        url='http://api.stackexchange.com/2.2/comments?page='+str(pgcount)+'&pagesize=100&fromdate=1391212800&todate=1393545600&order=desc&sort=votes&site=stackoverflow&filter=!)Q2B_4iOMMN.Vph(d2kUQ71l'
        json_data = requests.get(url)
        data=json_data.json()

        comment_list = data['items']
        #print answer_list

        for item in comment_list:
            userId=item['owner']['user_id'] 
            reputation=item['owner']['reputation'] 
            userName=item['owner']['display_name'] 
            edited=item['edited']
            creationDate=item['creation_date']
            commentId=item['comment_id']
       
            cur.execute("INSERT INTO commentBox(commentId,edited,creationDate,userId,userName,reputation) values(%s,%s,FROM_UNIXTIME(%s),%s,%s,%s)",
            (commentId,edited,creationDate,userId,userName,reputation))
            con.commit()
        json_data.close()

read_comments()

