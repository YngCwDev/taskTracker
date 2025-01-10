

# **Task Tracker**

Task Tracker is a simple and efficient **Command Line Interface (CLI)** tool designed to help you manage your tasks with ease. Track what you need to do, what you're currently working on, and what you've completed—all in one place.

---

## **Features**

### 🔒 **User Management**
- **Create Accounts**: Register with a username and password.
- **Login/Logout**: Securely log in to manage your tasks.
- **User Data Storage**: Each user has a dedicated JSON file to store their tasks.

### ✅ **Task Management**
- **Create Tasks**: Add new tasks with descriptions.
- **View Tasks**: List all your tasks with their statuses.
- **Update Tasks**: Modify existing task descriptions.
- **Delete Tasks**: Permanently remove tasks.
- **Track Status**: Keep track of tasks as:
    - **TODO**
    - **In Progress**
    - **Done**

### 🗂 **Data Security**
- User credentials and tasks are stored securely in JSON files.
- Passwords are hashed for security, ensuring safe data handling.

---

## **How It Works**

### **1. On Start**
- The system welcomes you with a brief introduction and displays input rules for ease of use.

### **2. User Login/Register**
- **If User Exists**: Log in using your username and password.
- **If User Does Not Exist**: Create a new account with a username and password.

### **3. Manage Tasks**
Use the **Tasks Manager** to perform various task-related actions:

| Command                         | Action                                             |
|---------------------------------|----------------------------------------------------|
| `create [description]`          | Create a new task with an auto-generated ID.       |
| `list`                          | View all tasks with their details.                |
| `mark-todo [id]`                | Mark a task's status as `TODO`.                   |
| `mark-in-progress [id]`         | Mark a task's status as `In Progress`.            |
| `mark-done [id]`                | Mark a task's status as `Done`.                   |
| `update [id] [new description]` | Update the description of an existing task.       |
| `delete [id]`                   | Permanently delete a task.                        |

---

## **Data Structure**

### **User Data**
Each user is represented in the system as:

```json
{
  "id": 1,
  "username": "johndoe",
  "password": "hashed_password",
  "timestamp": "2025-01-09T12:00:00Z",
  "fileById": "johndoe_tasks.json"
}
```

### **Task Data**
Tasks are stored in a user-specific JSON file:

```json
[
  {
    "id": 1,
    "description": "Complete project documentation",
    "status": "TODO",
    "createdAt": "2025-01-09T12:30:00Z",
    "updatedAt": "2025-01-09T12:30:00Z"
  },
  {
    "id": 2,
    "description": "Fix login bug",
    "status": "In Progress",
    "createdAt": "2025-01-09T13:00:00Z",
    "updatedAt": "2025-01-10T09:00:00Z"
  }
]
```

---

## **Setup and Usage**

### **1. Clone the Repository**
```bash
git clone https://github.com/yourusername/task-tracker.git
cd task-tracker
```
## **Command Reference**

### **User Commands**
| Command                           | Action                              |
|-----------------------------------|-------------------------------------|
| `login [username] [password]`     | Log in to the system.               |
| `register [username] [password]`  | Register a new account.             |
| `logout`                          | Log out of the system.              |

### **Task Commands**
| Command                           | Action                              |
|-----------------------------------|-------------------------------------|
| `create [description]`            | Create a new task.                  |
| `list`                            | List all tasks.                     |
| `mark-todo [id]`                  | Mark a task as `TODO`.              |
| `mark-in-progress [id]`           | Mark a task as `In Progress`.       |
| `mark-done [id]`                  | Mark a task as `Done`.              |
| `update [id] [new description]`   | Update task description.            |
| `delete [id]`                     | Delete a task.                      |

---

## **Future Enhancements**

### 🚀 Planned Features
- **Filters**: List tasks by status or creation date.
- **Search**: Quickly find specific tasks by keyword.
- **Task Sorting**: Organize tasks by status or priority.
- **Collaboration**: Enable multi-user task sharing and management.

---

## **Contributing**

Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request.

---

## **License**

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## **Contact**

Created with ❤️ by Alcides/yngCidw.  
Feel free to reach out via alcidesdaconceicao03@gmail.com for questions or suggestions.

