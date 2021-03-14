import React, {Component} from 'react';
import Home from "./Home/Home";
import Education from "./Education/Education";
import Work from "./Work/Work";
import Activities from "./Activities/Activities";
import Blog from "./Blog/Blog";
import Category from "./Blog/Category_filter/Category"
import Detail from "./Blog/detail/Detail";
import {
    BrowserRouter as Router,
    Switch,
    Route,
} from "react-router-dom";

class App extends Component {
    render() {
        return (
            <Router>
                <div>
                    <Switch>
                        <Route exact path="/">
                            <Home/>
                        </Route>
                        <Route exact path="/education">
                            <Education/>
                        </Route>

                        <Route path="/activities">
                            <Activities/>
                        </Route>
                        <Route path="/work">
                            <Work/>
                        </Route>
                        <Route path="/blog">
                            <Blog/>
                        </Route>
                        <Route path="/facebook">
                        </Route>
                        <Route path="/post/:slug" component={Detail}/>
                        <Route path="/blogCategory/:blogCategory" component={Category}/>
                    </Switch>
                </div>
            </Router>
        )
    }
}

export default App;
