'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom')
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {drinks: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/drinks'}).done(response => {
			this.setState({drinks: response.entity._embedded.drinks});
		});
	}

	render() {
		return (
			<DrinkList drinks={this.state.drinks}/>
		)
	}
}
// end::app[]

// tag::employee-list[]
class DrinkList extends React.Component{
	render() {
		var drinks = this.props.drinks.map(drink =>
			<Drink key={drink._links.self.href} drink={drink}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Description</th>
						<th>Price</th>
					</tr>
					{drinks}
				</tbody>
			</table>
		)
	}
}
// end::employee-list[]

// tag::employee[]
class Drink extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.drink.name}</td>
				<td>{this.props.drink.description}</td>
				<td>{this.props.price.price}</td>
			</tr>
		)
	}
}
// end::employee[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)
// end::render[]

