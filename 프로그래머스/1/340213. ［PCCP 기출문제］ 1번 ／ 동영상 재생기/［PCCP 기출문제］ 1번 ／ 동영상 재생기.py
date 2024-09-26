def solution(video_len, pos, op_start, op_end, commands):
    # 시간 문자열을 초 단위로 변환하는 함수
    def time_to_seconds(time_str):
        minutes, seconds = map(int, time_str.split(":"))
        return minutes * 60 + seconds

    # 초 단위를 다시 "mm:ss" 형식으로 변환하는 함수
    def seconds_to_time(time_seconds):
        minutes = time_seconds // 60
        seconds = time_seconds % 60
        return f"{minutes:02d}:{seconds:02d}"

    # 각 시간을 초 단위로 변환
    video_len_sec = time_to_seconds(video_len)
    pos_sec = time_to_seconds(pos)
    op_start_sec = time_to_seconds(op_start)
    op_end_sec = time_to_seconds(op_end)
    
    if op_start_sec <= pos_sec <= op_end_sec:
        pos_sec = op_end_sec

    # 명령어 처리
    for cmd in commands:
        if cmd == "next":
            # 10초 후로 이동 (비디오의 끝을 넘지 않도록 처리)
            pos_sec = min(pos_sec + 10, video_len_sec)
        elif cmd == "prev":
            # 10초 전으로 이동 (비디오의 처음을 넘지 않도록 처리)
            pos_sec = max(pos_sec - 10, 0)

        # 오프닝 구간에 있으면 오프닝 끝으로 이동
        if op_start_sec <= pos_sec <= op_end_sec:
            pos_sec = op_end_sec

    # 최종 위치를 "mm:ss" 형식으로 변환하여 반환
    return seconds_to_time(pos_sec)
