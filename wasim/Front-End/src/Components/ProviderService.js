import axios from 'axios';

const Register_Data_url = "http://localhost:8080/registry/register/";

class Statemntapi {
    getStatement(){
        return axios.get(Register_Data_url);
    }
}

export default new Statemntapi();