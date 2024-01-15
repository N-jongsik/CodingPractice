def solution(id_pw, db):
    a = 0
    if id_pw in db:
        return "login"
    else:
        for i in range(len(db)):
            if id_pw[0] != db[i][0]:
                continue
            else:
                a+=1
        return "fail" if a==0 else "wrong pw"