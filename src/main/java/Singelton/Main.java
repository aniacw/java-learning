//package Singelton;
//
//
//
//    public class LogedUser {
//
//        private static LogedUser logedUserInstance;
//
//        public static LogedUser logUser(String name) throws Exception {
//            if (logedUserInstance == null) {
//                LogedUser logedUser = new LogedUser();
//                logedUser.name = name;
//                logedUserInstance = logedUser;
//                return logedUser;
//            } else {
//                throw new Exception("Jest juz zalogowany uzytkownik");
//            }
//        }
//
//        public static LogedUser getLogedUserInstance() {
//            return logedUserInstance;
//        }
//
//        private LogedUser() {
//            this.name = name;
//        }
//
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "LogedUser{" +
//                    "name='" + name + '\'' +
//                    '}';
//        }
//    }
//
//}
