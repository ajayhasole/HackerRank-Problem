# Time Conversion

## Description

The purpose of this function is to convert a time given in 12-hour AM/PM format to a 24-hour military time format. This conversion is useful for applications requiring standard time formats, such as scheduling systems or international communication.

### Input

- A string representing the time in 12-hour format (e.g., "07:05:45PM").
  - The format consists of:
    - Two digits for the hour (01 to 12)
    - A colon
    - Two digits for the minutes (00 to 59)
    - A colon
    - Two digits for the seconds (00 to 59)
    - An uppercase "AM" or "PM" indicating whether the time is in the morning or afternoon.

### Output

- A string representing the time in 24-hour military format (e.g., "19:05:45").
  - The format consists of:
    - Two digits for the hour (00 to 23)
    - A colon
    - Two digits for the minutes (00 to 59)
    - A colon
    - Two digits for the seconds (00 to 59).

### Example

- **Input:** "12:01:00AM"
- **Output:** "00:01:00"

- **Input:** "12:01:00PM"
- **Output:** "12:01:00"

- **Input:** "07:05:45PM"
- **Output:** "19:05:45"