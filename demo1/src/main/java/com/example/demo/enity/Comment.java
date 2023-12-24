package com.example.demo.enity;


    public class Comment {
        private Long id;
        private Long userId; // 添加评论者名称属性
        private Long courseId;
        private String content;
        private String userName;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getCourseId() {
            return courseId;
        }

        public void setCourseId(Long courseId) {
            this.courseId = courseId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }


