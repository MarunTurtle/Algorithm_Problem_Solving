def solution(s: str) -> int:
    try:
        # Convert the string to an integer and return it
        return int(s)
    except ValueError:
        # If conversion fails, return 0
        return 0